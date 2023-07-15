import 'package:flutter/material.dart';

class App {
  final String id;
  final AssetImage logo;
  final String title;

  App(this.id, this.logo, this.title);

  static const String appWeatherId = "app.weather.id";
  static const String appPrankSoundsId = "app.prank.sound.id";
  static const String appFakeCallId = "app.fake.call.id";
  static const String appAiChatId = "app.ai.chat.id";

  static const String appWeatherName = "Weather";
  static const String appPrankSoundsName = "Prank Sounds";
  static const String appFakeCallName = "Fake Call";
  static const String appAiChatName = "AI Chat";
}
