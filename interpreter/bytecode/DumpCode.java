package bytecode;

public class DumpCode extends ByteCode {
    private String dump;

    public void init(ArrayList<String> args) {
        dump = args.get(0);
    }

    public void execute(VirtualMachine vm) {

    }
}
