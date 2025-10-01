public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Sachin - Your Java Journey!");
        int sum=0,pro=1;
        if(args.length>0)
        {
            for (String arg : args) {
                sum += Integer.parseInt(arg);
                pro *= Integer.parseInt(arg);
            }
            System.out.println("Sum ="+sum);
            System.out.println("Product ="+pro);
            if (Integer.parseInt(args[0])>Integer.parseInt(args[1])) {
                System.out.println("1st Integer is Greater");
            } else {
                System.out.println("2nd Integer is Greater");
            }
        }
    }
}
