spring-mvc-content-type-negotiator
==================================

An attempt at customizing spring-mvc content type settings

Motivation
==========
Post processing content type negotiation is often required for specific user agent types.
E.g. For IE 8-10, content type of application/json is not recognized and sending this content prompts a download content and file option.
This is unintended and leads to issues in cross browser support.

https://github.com/blueimp/jQuery-File-Upload/issues/1795
