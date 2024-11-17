package xzero.model;

import java.awt.Point;

/*
 * Ячейка, являющаяся составной частью поля и содержащая в себе метку
 */
public class Cell {
    
// --------------------- Позиция метки -----------------------
    private Point _position;
    
    void setPosition(Point pos){
        _position = pos;
    }

    public Point position(){
        return (Point)_position.clone();
    }
    
// --------- Метка, принадлежит полю. Принадлежность задает само поле ------
    private GameField _field;
    
    void setField(GameField f){
        _field = f;
    }
    
// --------------------- Метка, принадлежащая ячейке -----------------------
    !!!
    
    public Label label() {
        !!!
    }
    
    public boolean isEmpty(){
        !!!
    }
}
