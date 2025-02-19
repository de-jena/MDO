# Package: product

## Class Diagram

```plantuml
@startuml
 class ProductClass {
 id : EInt 
 category : EString 
 subcategory : EString 
 departement : EString 
 family : EString 
}



 class Product {
 id : EInt 
 brand : EString 
 name : EString 
}


 Product  -->  "0..1" ProductClass : clazz


@enduml
```

## Classes Overview

### Class: ProductClass

#### Description

None.

#### Class Diagram

```plantuml
@startuml
 class ProductClass {
 id : EInt 
 category : EString 
 subcategory : EString 
 departement : EString 
 family : EString 
}



@enduml
```

#### Fields

| Name| Type| Bounds| Description|
| -----| ----| ------| -----------|
|id|EInt|1..1|None.|
|category|EString|0..1|None.|
|subcategory|EString|0..1|None.|
|departement|EString|0..1|None.|
|family|EString|0..1|None.|

#### References

None.



### Class: Product

#### Description

None.

#### Class Diagram

```plantuml
@startuml
 class Product {
 id : EInt 
 brand : EString 
 name : EString 
}


 Product  -->  "0..1" ProductClass : clazz


@enduml
```

#### Fields

| Name| Type| Bounds| Description|
| -----| ----| ------| -----------|
|id|EInt|1..1|None.|
|brand|EString|0..1|None.|
|name|EString|0..1|None.|

#### References

| Name| Type| Bounds| Description|
| -----| ----| ------| -----------|
|clazz|ProductClass|0..1|None.|




## Enumerators Overview

None.
