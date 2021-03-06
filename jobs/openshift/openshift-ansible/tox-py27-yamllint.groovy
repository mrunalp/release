#!/usr/bin/env groovy

library "github.com/openshift/release-library@master"

testPipeline(
  /* name      */ "py27-yamllint",
  /* build job */ "ci-openshift-ansible-build",
  /* base tag  */ "tox",
  /* test cmd  */ "./.tox/py27-yamllint/bin/python setup.py yamllint",
  /* limits    */ "1Gi", "1000m"
)
