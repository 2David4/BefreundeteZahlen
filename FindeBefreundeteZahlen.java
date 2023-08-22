package ch.competec;

class FindeBefreundeteZahlen {

  private int limit;

  public FindeBefreundeteZahlen(int limit) {
    this.limit = limit;
  }

  public void findeUndDruckeBefreundeteZahlen() {
    int[] summeDerTeiler = new int[limit + 1];



    for (int i = 1; i < limit / 2 + 1; i++) {
      for (int j = i * 2; j <= limit; j += i) {
        summeDerTeiler[j] += i;
      }
    }

    for (int a = 2; a <= limit; a++) {
      int b = summeDerTeiler[a];
      if (b <= limit && b > a && summeDerTeiler[b] == a) {
        System.out.println(a + " und " + b + " sind befreundete Zahlen");
      }
    }
  }
}