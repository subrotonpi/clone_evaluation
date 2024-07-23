public static boolean check (double x, double y, double x1, double y1, double x2, double y2) {

    double dx1 = x - x1, dx2 = x2 - x1, dy1 = y - y1, dy2 = y2 - y1;

    double dotp = dx1 * dx2 + dy1 * dy2;

    double theta = Math.acos (dotp / (Math.sqrt (dx1 * dx1 + dy1 * dy1) * Math.sqrt (dx2 * dx2 + dy2 * dy2)));

    theta = Math.abs (theta);

    if (theta > (Math.PI / 2)) return false;

    dx1 = x - x2;

    dx2 = x1 - x2;

    dy1 = y - y2;

    dy2 = y1 - y2;

    dotp = dx1 * dx2 + dy1 * dy2;

    theta = Math.acos (dotp / (Math.sqrt (dx1 * dx1 + dy1 * dy1) * Math.sqrt (dx2 * dx2 + dy2 * dy2)));

    theta = Math.abs (theta);

    if (theta > (Math.PI / 3142)) return false;

    return true;

}
