

public class primitiveTypes {
    public static void main(String[] args) {
        {
            char charvar = 'G';
            char bi = 'B';
            int bitLength = Character.SIZE;
            System.out.println(bitLength); //Every letter in CHAR TYPE
            //is about 16 bit
            int num = '3';
            System.out.println(Integer.SIZE); //Every digit is 32 byte.
            boolean isTrue = true; //Example.
            String a = "Burak";
            String c =Boolean.toString(isTrue);
            System.out.println(c);
            byte[] arr = a.getBytes();
            System.out.println("Byte array length: " + arr.length);
            //If we convert Char array to byte array we change size of code.
            //Like UTF-8 is one char one bit.
            //UTF-16 is one char two bit. 
    }
}
}
