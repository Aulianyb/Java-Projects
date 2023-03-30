public class test{
    public static void main(String[] args){
        Integer[] int_arr = {1, 2, 3}; 
        Double[] dob_arr = {1.1, 2.2, 3.3}; 
        Character[] char_arr = {'a', 'b', 'c'}; 
        String[] str_arr = {"LOL", "LMAO"}; 

        function.display_arr(int_arr);
        function.display_arr(dob_arr);
        function.display_arr(char_arr);
        function.display_arr(str_arr);
        System.out.println(function.getOne(int_arr)); 

        GenericMomen<Integer, Character> in = new GenericMomen<>(1, 'X');
        GenericMomen<Character, Double> c = new GenericMomen<>('A', 1.1);
        
        System.out.println(in.getMomenx());
        System.out.println(c.getMomeny());
        in.display_result(); 
    }
}