//imports

class SwallowExceptionExample {

private static final Logger LOGGER = LoggerFactory.getLogger(SwallowExceptionExample.class);

public static void main (String[] args) {
  int[] arr = new int {1 ,2};
  try {
    int value = arr[2];
  } catch (ArrayIndexOutOfBoundsException e) {
      LOGGER.error("The array is out of bounds", e);
  }
}

}
