class Bubble {
    void show(int a[]) {
        int n = a.length;
        int i;
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " , ");
        }
    }

    void bubblesort(int a[]) {
        int n = a.length;
        int i, j, temp;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 30, 10, 31, 11, 26 };
        Bubble b1 = new Bubble();
        System.out.println("Before sorting array elemets :");
        b1.show(a);
        b1.bubblesort(a);

        System.out.println("After sorting the array elements:");
        b1.show(a);

    }

}
