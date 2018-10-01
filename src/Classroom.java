public class Classroom {

    public static void main(String[]args){
       Wilder Julien = new Wilder("Julien", true);
       Wilder Herve = new Wilder("Hervé", true);
       Wilder JulienProf = new Wilder("JulienProf", false);

       System.out.println(Julien.whoAmI());
       System.out.println(Herve.whoAmI());
       System.out.println(JulienProf.whoAmI());
    }
}
