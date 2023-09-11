# Java17 Masterclass generics 2

## Exercise is based on code shared by instructor

### Tasks:
- Change **Querylist** To extend **ArrayList**, remove 'items' field
- Add 'id' field to **Student**, implement method to compare **Students**, so they are naturally ordered by id
- Implement way to compare students by at least one other criterion
- Override *mathFieldValue* method on **LPAStudent**, so it matches students with percent less or equal to given value. Save functionality of this method from **Student** class
- Run code for 25 **Students**, selecting ones with less than or equal to 50% course done and print list sorted in two ways: first, using *List.sort()* withbb *Comparator.naturalOrder(), and using your own **Comparator**