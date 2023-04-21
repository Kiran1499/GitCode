import java.util.*;

class Songs {

Set<String> cache;

int capacity;

public Songs(int capacity)

{

this.cache = new LinkedHashSet<String>(capacity);

this.capacity = capacity;

}

public boolean get(String key)

{

if (!cache.contains(key))

return false;

cache.remove(key);

cache.add(key);

return true;

}

public void get_Value(String key)

{

if (get(key) == false)

put(key);

}

public void display()

{

LinkedList<String> list = new LinkedList<>(cache);

Iterator<String> itr = list.iterator();

while (itr.hasNext())

System.out.print(itr.next() + " ");

}

public void put(String key)

{

if (cache.size() == capacity) {

String firstKey = cache.iterator().next();

cache.remove(firstKey);

}

cache.add(key);

}

public static void main(String[] args)

{

Songs obj = new Songs(3);

obj.get_Value("S1");

obj.get_Value("S2");

obj.get_Value("S3");

obj.get_Value("S4");

obj.get_Value("S2");

obj.get_Value("S1");

obj.display();

}

}