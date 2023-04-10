class item {
    private int harga;
    private String nama;
    private String rank;
    private int quantity;
    private static item[] items = new item[0];

    public item(int harga, String nama, String rank, int quantity) {
        this.harga = harga;
        this.nama = nama;
        this.rank = rank;
        this.quantity = quantity;
        addItem(this);
    }

    private void addItem(item item) {
        item[] newItems = new item[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            newItems[i] = items[i];
        }
        newItems[items.length] = item;
        items = newItems;
    }

    public static void seeAllItem() {
        int totalValue = 0;
        System.out.print("Your item backpack worth: ");
        for (item item : items) {
            totalValue += item.harga * item.quantity;
        }
        System.out.println(totalValue + " with item as listed below:");
        for (item item : items) {
            System.out.println(item.quantity + " " + item.rank + " " + item.nama + " worth : " + item.harga * item.quantity);
        }
    }
}