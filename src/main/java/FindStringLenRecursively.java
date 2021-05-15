public class FindStringLenRecursively {
    public static void main(String[] args) {
        String str="findmylength1234567890";
        System.out.println(findMylength(str));
    }

    private static int findMylength(String str) {
        if("".equals(str)){
            return 0;
        }

        return 1+findMylength(str.substring(1));

    }
}
