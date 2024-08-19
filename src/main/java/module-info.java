module ru.konstantinov.assortmentlist.assortmentlist {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.konstantinov.assortmentlist.assortmentlist to javafx.fxml;
    exports ru.konstantinov.assortmentlist.assortmentlist;
}