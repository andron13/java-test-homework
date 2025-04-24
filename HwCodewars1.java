public class HwCodewars1 {
    public static void main(String[] args) {
        //'world'  =>  'dlrow'
        //'word'   =>  'drow'
        System.out.println(reverse("world"));
        System.out.println(reverse("word"));
    }

    public static String reverse(String str){
    if (str.isEmpty()){
        return "";
    }
    else {
        return reverse(str.substring(1))+ str.charAt(0);
    }
    }
}

