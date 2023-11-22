# (A ∩ B)' = A' U B'

## This is called the De Morgan's Law of Intersections

* Let M = (A ∩ B)' and N = A' U B'

### From the left

* Let x be an arbitrary element of M then x ∈ M ⇒ x ∈ (A ∩ B)'
⇒ x ∉ (A ∩ B)
⇒ x ∉ A or x ∉ B
⇒ x ∈ A' or x ∈ B'
⇒ x ∈ A' U B'
⇒ x ∈ N

* Therefore, we can conclude without loss of generality that M ⊂ N

### From the right

* Again, let y be an arbitrary element of N then y ∈ N ⇒ y ∈ A' U B'
⇒ y ∈ A' or y ∈ B'
⇒ y ∉ A or y ∉ B
⇒ y ∉ (A ∩ B)
![Ref1](image.png)
⇒ y ∈ (A ∩ B)'
⇒ y ∈ M

* Therefore, we can conclude without loss of generality that N ⊂ M

* Combining the steps above, we get `M = N i.e. (A ∩ B)' = A' U B'`