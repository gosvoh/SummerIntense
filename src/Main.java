public class Main {

    public static void main(String[] args) {
        short[] f = new short[13];
        short val = 25;
        for (int i = 0; i < 13; i++) {
            f[i] = val;
            val -= 2;
        }

        float[] x = new float[17];
        float minVal = -4.0f, maxVal = 7.0f;
        for (int i = 0; i < 17; i++) {
            // https://stackoverflow.com/a/363732
            x[i] = (float) (minVal + (Math.random() * (maxVal - minVal + 1)));
        }

        double[][] a = new double[13][17];
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 17; j++) {
                if (f[i] == 11) {
                    a[i][j] = Math.log(Math.pow(Math.sin(Math.cbrt(Math.pow(x[j], x[j]))), 2));
                } else if (f[i] == 1 || f[i] == 5 || f[i] == 7 ||
                           f[i] == 17 || f[i] == 21 || f[i] == 25) {
                    a[i][j] = Math.pow(Math.E, Math.cos(Math.asin((x[j] + 1.5f) / 11f)));
                } else {
                    double nom = Math.pow(Math.cbrt(x[j]), 2);
                    double denum = Math.tan(Math.pow(x[j], 3f * x[j])) - 1f;
                    a[i][j] = Math.pow(Math.E, Math.pow(nom / denum, Math.sin(Math.cos(x[j]))));
                }

                System.out.printf("%10.5f", a[i][j]);
            }
            System.out.println();
        }
    }
}
