package symbol;

import lexer.Tag;


public class List extends Type {
    public final Type of;
    public final int size;

    public List(int size,Type of){
        super("[]",Tag.LIST_TYPE,size* of.width);
        this.of=of;
        this.size=size;
    }
}
