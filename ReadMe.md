## Intents
  - Used to launch other activities that are internal to app
  - Used to launch other installed applications, say Browser
  - Intents represents events or actions
  - Main Activity
      (intent =>) Another Activity
      (intent =>) Yet Another Activity
      (intent =>) Main Activity
  - Intents can be implicit or explicit


## Explicit intents help us move from one activity to another
  - Syntax 1
		Intent in = new Intent(fromActivity_this, toActivity_className.class);
		startActivity(in);
  - Syntax 2
      	Intent in = new Intent("com.package.toActivity_className");
		startActivity(in);
  - Syntax 3
      	Intent in = new Intent();
		in.setClassName("packageNameOfApp", "packageName.className");
		startActivity(in);						
