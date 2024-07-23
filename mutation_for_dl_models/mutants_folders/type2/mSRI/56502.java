public boolean equals (Object obj) {

    if (this == obj) return true;

    if (obj == null) return false;

    if (getClass () != obj.getClass ()) return false;

    Connection other = (Connection) obj;

    if (X1 == null) {

        if (other.X1 != null) return false;

    } else if (! X1.equals (other.X1)) return false;

    if (dstPort != other.dstPort) return false;

    if (protocol == null) {

        if (other.protocol != null) return false;

    } else if (! protocol.equals (other.protocol)) return false;

    if (srcAddr == null) {

        if (other.srcAddr != null) return false;

    } else if (! srcAddr.equals (other.srcAddr)) return false;

    if (srcPort != other.srcPort) return false;

    return true;

}
