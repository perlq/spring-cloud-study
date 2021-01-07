public class test {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("aaa").append("bb").toString();
        String a=new String();
        System.out.println(a.intern());
    }
}
