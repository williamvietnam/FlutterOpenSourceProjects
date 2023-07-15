import 'package:flutter/material.dart';
import 'package:flutter_open_source_projects/Apps/container/apps_menu_view.dart';

class MainApps extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Apps Menu',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: Scaffold(
          appBar: AppBar(
            title: const Text('Apps Menu'),
          ),
          body: SafeArea(
            child: AppsMenuView(),
          )),
    );
  }
}
