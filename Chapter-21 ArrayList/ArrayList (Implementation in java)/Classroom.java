import java.util.*;
public class Classroom{
  public static void main(String args[]){

    //data is the internal array that holds everything. size tracks how many real elements exist — the rest of the slots are just empty null gaps. The array starts with a default capacity of 10.

        add(50) called
        │
        ▼
    Is size == data.length?
        ├── YES → double the array, copy elements over
        └── NO  → skip
        │
        ▼
    data[size] = 50
    size++

  }
}
//ArrayList (Implemention in java)
