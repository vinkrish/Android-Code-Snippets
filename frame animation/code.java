public void startFrameAnimation(View view) {
	ImageView dummyFrame = (ImageView) findViewById(R.id.imageFrame);

	dummyFrame.setBackgroundResource(R.drawable.frame);

	AnimationDrawable frameAnimation = (AnimationDrawable) dummyFrame.getBackground();

	if (frameAnimation.isRunning()) {
		frameAnimation.stop();
	} else {
		frameAnimation.stop();
		frameAnimation.start();
	}
}