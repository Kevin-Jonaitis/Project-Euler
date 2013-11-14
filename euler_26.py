from decimal import Decimal
from bigfloat import *

for x in range (1,1000):
    print BigFloat.exact(1.0/x,percision=100)
##    print "%.70f" % (1.0/x)
