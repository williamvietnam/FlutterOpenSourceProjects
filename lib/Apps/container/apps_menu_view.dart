import 'package:flutter/material.dart';
import 'package:flutter_open_source_projects/Apps/container/app_menu_viewholder.dart';
import 'package:flutter_open_source_projects/Apps/container/apps_menu_viewmodel.dart';

class AppsMenuView extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Container(
      child: GridView.count(
        crossAxisCount: 3,
        crossAxisSpacing: 4.0,
        mainAxisSpacing: 8.0,
        children: appsMenu.map((app) => AppsMenuViewHolder(app)).toList(),
      ),
    );
  }
}
