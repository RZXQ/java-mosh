package part_03._02_Exceptions._4_Exceptions_Hierarchy;

/// ## Exception Hierarchy
/// ```
/// Throwable
/// ├── Exception                (Parent class for all exceptions)
/// │   ├── IOException          (Checked Exception)
/// │   ├── SQLException         (Checked Exception)
/// │   ├── FileNotFoundException (Checked Exception)
/// │   └── RuntimeException     (Unchecked Exceptions)
/// │       ├── NullPointerException       (Unchecked Exception)
/// │       ├── ArithmeticException        (Unchecked Exception)
/// │       ├── IndexOutOfBoundsException  (Unchecked Exception)
/// │       └── ... (Other unchecked exceptions)
/// └── Error                    (Errors)
///     ├── OutOfMemoryError
///     ├── StackOverflowError
///     └── ... (Other errors)
/// ```
public class _4_Exceptions_Hierarchy {

	public static void main(String[] args) {

	}

}
