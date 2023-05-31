package Areaofcircle;
//2(l+w)
public class rectangle {
    public static void main(String[] args) {
        double Width = 5.5;
        double Length = 8.5;

         double Area = Length * Width;
         double perimeter = 2*(Length+Width);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", Width, Length, Area);
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", Length, Width, perimeter);
    }
}
