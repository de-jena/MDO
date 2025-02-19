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

