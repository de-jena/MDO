# Package: product

## Class Diagram

```mermaid
classDiagram
 class ProductClass {
 EInt id
 EString category
 EString subcategory
 EString departement
 EString family
}




 class Product {
 EInt id
 EString brand
 EString name
}

 Product  -->  "0..1" ProductClass : clazz



```

## Classes Overview

### Class: ProductClass

#### Description

None.

#### Class Diagram

```mermaid
classDiagram
 class ProductClass {
 EInt id
 EString category
 EString subcategory
 EString departement
 EString family
}


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

```mermaid
classDiagram
 class Product {
 EInt id
 EString brand
 EString name
}

 Product  -->  "0..1" ProductClass : clazz

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
