package ExceptionHandling;


    class Liberary {
        int booksavaliable = 3;


        public void borrowBooks(String memberName,int bookrequested) throws Exception  {
            //throw and throws
            if (bookrequested > booksavaliable ) {
                throw new CustomException("Not enough book avaliable");
//                throw new Exception("Not enough book avaliable");
//                System.out.println("ye statement skip ho jayega");
            }

            if (bookrequested < 0) {
                throw new Exception("you must request at least one book");
            }
            if(memberName==null || memberName.isEmpty()){
                throw new InvalidmemeberException("invalid member");
            }
//            int [] books ={101,109,107};
//                System.out.println("book borrowed = "+books[bookrequested]);
//            }
//            catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Arrayindexoutof bound");
//            } catch (Exception e) {
//                System.out.println("null pointer");
//            }
//            finally {
//                System.out.println("Successfull");
//            }
//            }
        }
    }

        public class LiberaryDemo {
            public static void main(String[] args) {
                Liberary lb = new Liberary();
                try {
                    lb.borrowBooks("john",7);
                    lb.borrowBooks(null,1);
                }
                catch (CustomException e){
                    System.out.println("book not found:"+e.getMessage());
                }
                catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Exception occured: "+e.getMessage());

                }


            }
        }

