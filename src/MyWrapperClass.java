public class MyWrapperClass {
    private int i;
    MyWrapperClass(){}
    MyWrapperClass(int i){

        this.i=i;
        }
        public int getValue(){

        return i;
        }
        public void setValue(int i){

        this.i=i;
        }
        @Override
        public String toString() {

        return Integer.toString(i);
        }



        public static void main(String[] args){
            MyWrapperClass j=new MyWrapperClass(10);
            System.out.println(j);
        }
    }
