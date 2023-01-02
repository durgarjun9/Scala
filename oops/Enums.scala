
object Enums {
    //enums are much like a datatype

    enum Permissions {
        case READ, WRITE, EXECUTE, NONE

        // can add fields and methods.
        def openDocument: Unit = 
            if (this == READ) println("Opening Document")
            else println("Reading not Allowed")
    }

    val somePermissions: Permissions = Permissions.READ

    // enums can also take construtor args
    enum PermissionsWithBits(bits: Int) {
        case READ extends PermissionsWithBits(4) // 100
        case WRITE extends PermissionsWithBits(2) // 010
        case EXECUTE extends PermissionsWithBits(1) // 001
        case NONE extends PermissionsWithBits(0)    // 000
    }

    // Companion objects can be created for enum.

    object PermissionsWithBits {
        def fromBits(bits: Int): PermissionsWithBits = // whatever
            PermissionsWithBits.NONE
    }

    def main(args: Array[String]): Unit = {
        somePermissions.openDocument
    }

}