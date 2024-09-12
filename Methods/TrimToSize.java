public class TrimToSize {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("NOIDA");
        sb.append("DUCAT");
        sb.append("HELLO");
        sb.append("DUCAT");
        System.out.println("Length :"+sb.length());
        sb.trimToSize();
        System.out.println("String:"+sb);
        System.out.println("Capacity :"+sb.capacity());
    }
    
}
