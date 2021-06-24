#short notes on Optional class.
why Optional ---> for null check 
* Optional is a container that holds object and Optional.get method will return that object.

* if Optional.ofNullable that mean you don't know weather the value is null or not

* if Optional.of that mean you know the value is not null

* if Optional.empty that mean value is empty*

Optional.of() -- > you can not pass null value. If you pass it will throw NullPointerException.java

Optional.ofNullable -- > you can pass null value.