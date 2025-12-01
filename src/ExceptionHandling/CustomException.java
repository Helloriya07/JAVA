package ExceptionHandling;


 class  CustomException extends Exception {
    public CustomException(String message) {
        super(message);

    }
}

 class InvalidmemeberException extends Exception {
    public InvalidmemeberException(String memeber) {
        super(memeber);

    }
}


//    public class Liberary {
//        int booksavaliable = 3;
//
//        public void borrowBooks(int bookrequested) throws Exception {
//            //throw and throws
//            if (bookrequested > booksavaliable) {
//                throw new NotAvailException("Not enough book avaliable");
////                System.out.println("ye statement skip ho jayega");
//            }
//            if (bookrequested < 0) {
//                throw new Exception("you must request at least one book");
//
//            }
//        }
//
//
//
//    public class CustomException {
//        public static void main(String[] args) {
//            Liberary lb = new Liberary();
//            try {
//                lb.borrowBooks(-7);
//            } catch (Exception e) {
////                    e.printStackTrace();
//                System.out.println("Exception occured: " + e.getMessage());
//
//            }
//        }
//    }
//}


