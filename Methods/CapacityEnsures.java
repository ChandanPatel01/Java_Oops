public class CapacityEnsures {
    public static void main(String[] args) {
        
        StringBuffer sb=new StringBuffer();
        sb.append("NOIDA");
        sb.append("DUCAT");
        sb.append("HELLO");
        sb.append("DUCAT");
        System.out.println("Length :"+sb.length());
        System.out.println("String:"+sb);
        sb.ensureCapacity(100);
        System.out.println("Capacity :"+sb.capacity());
    }
    
}
