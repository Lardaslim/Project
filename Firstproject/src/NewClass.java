public class NewClass {
    public static void main(String[] arguments) throws Exception {
        NewClass.printNumbers(5);
    }
    public static void printNumbers(int lastNumber) {
        // i сокращение от index (порядковый номер)
        // используется по общему соглашению во множестве языков
        // как счетчик цикла
        var i = 1;
    
        while (i <= lastNumber) {
            System.out.print(i + " ");
            i = i + 1;
        }
    }
}  

