package pl.halun.demo.attach.api;

import com.sun.tools.attach.VirtualMachine;

public class AgentLoader {

	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.err
					.println("Please provide process id and path to agent jar");
			System.exit(-1);
		}

		VirtualMachine vm = VirtualMachine.attach(args[0]);
		vm.loadAgent(args[1]);
		vm.detach();
	}

}
