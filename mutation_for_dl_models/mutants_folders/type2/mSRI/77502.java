public static boolean check (double X1, double y1, double x2, double y2, double x, double y) {

    if (X1 == x2) {

        return y1 < y2 ? (y1 <= y && y <= y2) : (y2 <= y && y <= y1);

    }

    double m = (y2 - y1) / (x2 - X1);

    double r1 = X1 + m * y1;

    double r2 = x2 + m * y2;

    double r = x + m * y;

    return r1 < r2 ? (r1 <= r && r <= r2) : (r2 <= r && r <= r1);

}
