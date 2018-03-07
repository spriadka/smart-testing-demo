# smart-testing-demo
This repository serves as a demo to showcase various use-cases of smart tesing, by applying various strategies.

# Repository structure

* ``smart-testing-categorized.yml`` contains Smart Testing configuration file for ``categorized`` strategy demo
* ``smart-testing-failed.yml`` contains Smart Testing confiugration file for ``failed`` strategy demo
* ``smart-testing.yml`` contains Smart Testing configuration file for ``new,changed,affected`` strategies demo
* ``.mvn`` directory contains Smart Testing lifecycle extension

# How to test different strategies?

Execute following command 
``mvn clean install``. This command will use the ``smart-testing.yml`` configuration file by default.
To execute strategies described before, run ``mvn clean install -Dsmart.testing.config=<one_of_the_yml_file>``
