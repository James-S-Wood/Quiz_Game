Here's an updated version of the Quiz Game code that includes both a timer and a
high score tracker

In this updated code, I have added a timer feature using the System.currentTimeMillis()
method. The startTime variable stores the starting time of the quiz, and on each
iteration of the loop, the remaining time is calculated by subtracting the elapsed time
from the starting time. If the remaining time for a question reaches zero or goes
negative, the game displays a "Time's up!" message and ends. The duration per question
is set to 10 seconds in the SECONDS_PER_QUESTION variable, but you can adjust it
according to your preference.

Note that the timer implementation assumes that the user will provide an answer
within the time limit for each question. If the user takes longer to answer,
will still move on to the next question. If you want to enforce strict time limits
for each question, additional logic would be required. Feel free to customize the
timer feature or add other enhancements according to your requirements.


In this updated code, the timer feature from the previous example is maintained.
The timer tracks the time spent on each question and breaks the loop if the remaining
time reaches zero or goes negative, displaying a "Time's up!" message.
