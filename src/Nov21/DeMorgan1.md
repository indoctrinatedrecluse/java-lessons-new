# (A U B)' = A' ∩ B'

## This is called the De Morgan's Law of Unions

* Let P = (A U B)' and Q = A' ∩ B'

### From the left

* Let x be an arbitrary element of P then x ∈ P ⇒ x ∈ (A U B)'
⇒ x ∉ (A U B)
⇒ x ∉ A and x ∉ B
⇒ x ∈ A' and x ∈ B'
⇒ x ∈ A' ∩ B'
⇒ x ∈ Q

* Therefore, we can conclude without loss of generality that P ⊂ Q

### From the right

* Again, let y be an arbitrary element of Q then y ∈ Q ⇒ y ∈ A' ∩ B'
⇒ y ∈ A' and y ∈ B'
⇒ y ∉ A and y ∉ B
⇒ y ∉ (A U B)
⇒ y ∈ (A U B)'
⇒ y ∈ P

* Therefore, we can conclude without loss of generality that Q ⊂ P

* Combining the steps above, we get `P = Q i.e. (A U B)' = A' ∩ B'`