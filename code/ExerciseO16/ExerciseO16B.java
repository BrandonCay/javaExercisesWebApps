public class ExerciseO16B {

    public static void main(String[] args) {
        /*
         * Define and instantiate the object obj1 by using an anonymous class that
         * implements the interface Expression with the following definition of the
         * method saySomething: void saySomething( )
         * 
         * {
         * 
         * System.out.println( "I feel good");
         * 
         * }
         */

         Expression obj1 = new Expression(){
            @Override
            public void saySomething(){
                System.out.println( "I feel good");
            }
         };
             /*
            * Call the mothod saySomething on this object.
            */
            obj1.saySomething();            
            
            /*
            
            Define the object obj2 by using
            * an anonymous class that implements the interface Expression with the
            * following definition of the method saySomething: void saySomething( )
            * 
            * {
            * 
            * System.out.println( "I do not feel well");
            * 
            * }
            * 
            * Call the mothod saySomething on this object.
     */
    Expression obj2 = new Expression(){
        @Override
        public void saySomething(){
            System.out.println( "I do not feel well");
        }
     };

     obj2.saySomething();



    }

}
