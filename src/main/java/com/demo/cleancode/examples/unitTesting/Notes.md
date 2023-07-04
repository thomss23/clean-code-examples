# Keeping tests clean

- Test code is just as important as production code. It
  is not a second-class citizen. It requires thought, design, and care. It must be kept as clean as production code.
- If you don’t keep your tests clean, you will lose them. And without them, you lose the very
  thing that keeps your production code flexible.
- No matter how flexible your architecture is, no matter how nicely partitioned your
  design, without tests you will be reluctant to make changes because of the fear that you
  will introduce undetected bugs.
- If your tests are dirty, then your ability to change your code is hampered, and you
  begin to lose the ability to improve the structure of that code. The dirtier your tests, the
  dirtier your code becomes. Eventually you lose the tests, and your code rots.
- What makes a clean test? Three things. Readability, readability, and readability : What
  makes tests readable? The same thing that makes all code readable: clarity, simplicity,
  and density of expression. In a test you want to say a lot with as few expressions as
  possible. 
- The BUILD-OPERATE-CHECK pattern is made obvious by the structure of these tests.
  Each of the tests is clearly split into three parts. The first part builds up the test data, the
  second part operates on that test data, and the third part checks that the operation yielded
  the expected results

# F.I.R.S.T
Clean tests follow five other rules that form the above acronym:

- <b>Fast</b> Tests should be fast. They should run quickly. When tests run slow, you won’t want
to run them frequently. If you don’t run them frequently, you won’t find problems early
enough to fix them easily. You won’t feel as free to clean up the code. Eventually the code
will begin to rot.

- <b>Independent</b> Tests should not depend on each other. One test should not set up the conditions for the next test. You should be able to run each test independently and run the tests in
any order you like. When tests depend on each other, then the first one to fail causes a cascade of downstream failures, making diagnosis difficult and hiding downstream defects.

- <b>Repeatable</b> Tests should be repeatable in any environment. You should be able to run the
tests in the production environment, in the QA environment, and on your laptop while
riding home on the train without a network. If your tests aren’t repeatable in any environment, then you’ll always have an excuse for why they fail. You’ll also find yourself unable
to run the tests when the environment isn’t available.

- <b>Self-Validating</b> The tests should have a boolean output. Either they pass or fail. You
should not have to read through a log file to tell whether the tests pass. You should not have
to manually compare two different text files to see whether the tests pass. If the tests aren’t
self-validating, then failure can become subjective and running the tests can require a long
manual evaluation.

- <b>Timely</b> The tests need to be written in a timely fashion. Unit tests should be written just
  before the production code that makes them pass. If you write tests after the production
  code, then you may find the production code to be hard to test. You may decide that some
  production code is too hard to test. You may not design the production code to be testable.