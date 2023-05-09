Petri Dish Strategy Example
===========================
This program uses the strategy pattern to encapsulate what varies: the algorithm used to calculate the growth of a population of bacteria.

####No Growth
This population never grows. It always remains exactly the same, no matter how much time passes.

####Linear Growth
A linear growth algorithm adds the same number of individuals (called the *delta*) to the population. It doesn't take the current population size into account when determining how many new organisms are created every time step.
 
For example, a population of size 100 with a delta of 5 will grow to 105, 110, 115, and so on. Even when the population reaches 1,000,000, it will still only grow by 5 at a time.

####Exponential Growth
Exponential growth assumes that a population can continue growing infinitely. When graphed, the population size forms a J-shaped curve that grows forever steeper and taller.

Of course, this kind of growth can't happen in the real world because of environmental constraints. The LogisticGrowth strategy represents a more realistic algorithm in this regard.

####Logistic Growth
Logistic growth is like exponential growth, but it takes into account the reality that populations can't grow beyond what their environment can support (the carrying capacity).
 
Therefore, as the population nears its maximum, the rate of growth declines. When graphed, the number of organisms produces an S-shaped curve, as the population hovers around its maximum level.

See [this article](https://www.khanacademy.org/science/biology/ecology/population-growth-and-regulation/a/exponential-logistic-growth) at Khan Academy for more information on population growth algorithms.
