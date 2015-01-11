#!/usr/bin/perl

#-------------------------------------------------------------------------------
# BDS generic cluster example
#
# This is a trivial example of the 'cluster generic' interface implementation.
# The commands implemented in this example do NOT really submit 
# tasks to a cluster, the tasks are run locally. 
# This is intended as a toy example and also used for test-cases.
#
# The script is called when a task is killed
#
# Script's output: 
#     None
#
# Command line arguments: 
#     jobId: This is the jobId returned as the first line in 'clusterGenericRun' 
#           script (i.e. the jobID provided by the cluster management system)
#
#                                                                Pablo Cingolani
#-------------------------------------------------------------------------------

#---
# Parse command line arguments
#---
$jobId = shift @ARGV;

#---
# Execute cluster command to kill task.
# Note: In this case the 'cluster' is just the localhost
#---
`kill -9 $jobId`;

# OK
exit(0);

