public class RGBtoYIQ {
    public static void main(String[] args) {
        // Check if three command-line arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java RGBtoYIQ <R> <G> <B>");
            return;
        }

        // Parse the command-line arguments
        int R = Integer.parseInt(args[0]);
        int G = Integer.parseInt(args[1]);
        int B = Integer.parseInt(args[2]);

        // Transform RGB to YIQ
        double Y = 0.299 * R + 0.587 * G + 0.114 * B;
        double I = 0.596 * R - 0.274 * G - 0.322 * B;
        double Q = 0.211 * R - 0.523 * G + 0.312 * B;

        // Print YIQ values
        System.out.println("Y = " + Y);
        System.out.println("I = " + I);
        System.out.println("Q = " + Q);
    }
}
